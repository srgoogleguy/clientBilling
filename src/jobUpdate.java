import java.util.TimerTask;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author googleguy
 */
public class jobUpdate extends TimerTask {
    
    public mainWindow window;
    
    public jobUpdate(mainWindow window) {
        this.window = window;
    }
     
    @Override
    public void run() {
        long seconds, min;
        String rTotal, bTotal;
        min = 60*15;
        seconds = System.currentTimeMillis() - this.window.startTime;
        seconds += this.window.clockTotal;
        seconds = Math.round(seconds / 1000);
        String time;
        time = this.formatTime(seconds);
        this.window.updateClock(time);
        rTotal = this.calculateTotal(seconds, this.window.rate, 0);
        bTotal = this.calculateTotal(seconds, this.window.rate, min);
        this.window.updateRunningTotal(rTotal);
        this.window.updateBillingTotal(bTotal);
        this.window.updateBillingHours(String.format("%.2f", this.getBillableHours(seconds,min)));
    }
    
    private String formatTime(long seconds) {
        long s,m,h;
        String t;
        s = seconds % 60;
        m = Math.round(Math.floor(seconds / 60)) % 60;
        h = Math.round(Math.floor(seconds / 60 / 60));
        t = String.format("%02d:%02d:%02d", h, m, s);
        return t;
    }
    
    private String calculateTotal(long seconds, double rate, long min) {
        String total = "$0.00";
        double r;
        if (rate > 0) {
            if (min > 0) {
                double hours = this.getBillableHours(seconds, min);
                r = hours * rate;
            } else {
                r = (rate / 60 / 60) * seconds;
            }
            total = String.format("$%.2f", r);
        }
        return total;
    }
    
    private double getBillableHours(long seconds, long min) {
        double coeff = (3600 / ((double)min));
        double hours = Math.round((((double)seconds)/60/60)*coeff)/coeff;
        return hours;
    }

}
