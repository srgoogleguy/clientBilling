/*
 *   This file is part of Client Billing Tool.
 *
 *   Client Billing Tool is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Lesser General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Client Billing Tool is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public License
 *   along with Client Billing Tool.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.awt.Toolkit;
import java.util.Timer;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

/*
 * mainWindow.java
 *
 * Created on Feb 14, 2014, 4:36:47 AM
 */
/**
 *
 * @author Sherif Ramadan
 */
public class mainWindow extends javax.swing.JFrame {

    public boolean clockState = false;
    public long startTime = 0;
    public long clockTotal = 0;
    public Timer jobTicker;
    public double rate = 60.00;

    /** Creates new form mainWindow */
    public mainWindow() {
        initComponents();
        this.jobTicker = new Timer();
        this.rateTextField.addCaretListener(new CaretListener() {

            @Override
            public void caretUpdate(CaretEvent e) {
                rateValueUpdate();
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rateLabel = new javax.swing.JLabel();
        rateTextField = new javax.swing.JTextField();
        ratePerLabel = new javax.swing.JLabel();
        rateCurrencyLabel = new javax.swing.JLabel();
        clockValueLabel = new javax.swing.JLabel();
        clockButton = new javax.swing.JButton();
        clockResetButton = new javax.swing.JButton();
        billableHoursLabel = new javax.swing.JLabel();
        runningTotalLabel = new javax.swing.JLabel();
        billableAmountLabel = new javax.swing.JLabel();
        billableHoursValueLabel = new javax.swing.JLabel();
        runningTotalValueLabel = new javax.swing.JLabel();
        billableAmountValueLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client Billing");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/clientBilling.png")));
        setResizable(false);

        rateLabel.setFont(new java.awt.Font("SansSerif", 1, 18));
        rateLabel.setText("Rate");

        rateTextField.setColumns(10);
        rateTextField.setText("60.00");

        ratePerLabel.setFont(new java.awt.Font("Dialog", 1, 14));
        ratePerLabel.setText("/ hour");

        rateCurrencyLabel.setFont(new java.awt.Font("Dialog", 1, 14));
        rateCurrencyLabel.setText("$");

        clockValueLabel.setFont(new java.awt.Font("Monospaced", 1, 24));
        clockValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clockValueLabel.setText("00:00:00");

        clockButton.setText("Start");
        clockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockButtonActionPerformed(evt);
            }
        });

        clockResetButton.setText("Reset");
        clockResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockResetButtonActionPerformed(evt);
            }
        });

        billableHoursLabel.setFont(new java.awt.Font("Dialog", 1, 12));
        billableHoursLabel.setText("Billable Hours:");

        runningTotalLabel.setFont(new java.awt.Font("Dialog", 1, 12));
        runningTotalLabel.setText("Running Total:");

        billableAmountLabel.setFont(new java.awt.Font("Dialog", 1, 12));
        billableAmountLabel.setText("Billable Amount:");

        billableHoursValueLabel.setText("0.00");

        runningTotalValueLabel.setText("$0.00");

        billableAmountValueLabel.setText("$0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rateLabel)
                        .addGap(18, 18, 18)
                        .addComponent(rateCurrencyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ratePerLabel))
                    .addComponent(clockValueLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(billableHoursLabel)
                            .addComponent(runningTotalLabel)
                            .addComponent(billableAmountLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(billableAmountValueLabel)
                            .addComponent(runningTotalValueLabel)
                            .addComponent(billableHoursValueLabel)
                            .addComponent(clockResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rateLabel)
                    .addComponent(ratePerLabel)
                    .addComponent(rateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rateCurrencyLabel))
                .addGap(18, 18, 18)
                .addComponent(clockValueLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clockButton)
                    .addComponent(clockResetButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billableHoursLabel)
                    .addComponent(billableHoursValueLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(runningTotalLabel)
                    .addComponent(runningTotalValueLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billableAmountLabel)
                    .addComponent(billableAmountValueLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void rateValueUpdate() {
        if (this.rateTextField.getText().length() > 0) {
            try {
                this.rate = Double.parseDouble(this.rateTextField.getText());
            } catch (Exception e) {
                this.rate = 0.0;
            }
        }
        /*
         * Update billable hours and running total here, but only if the timer
         * isn't running anymore.
         * 
         */
        if (!this.clockState) {
            long s;
            s = Math.round(this.clockTotal / 1000);
            String rTotal = this.calculateTotal(s, this.rate, 0);
            String bTotal = this.calculateTotal(s, this.rate, 900L);
            this.updateRunningTotal(rTotal);
            this.updateBillingTotal(bTotal);
        }

    }

    private void clockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockButtonActionPerformed
        if (!this.clockState) {
            this.startTime = System.currentTimeMillis();
            this.clockButton.setText("Stop");
            this.clockState = true;
            this.jobTicker.scheduleAtFixedRate(new jobUpdate(this), 100, 100);
        } else {
            this.jobTicker.cancel();
            this.jobTicker = new Timer();
            this.clockState = false;
            this.clockTotal += System.currentTimeMillis() - this.startTime;
            this.clockButton.setText("Start");
        }
    }//GEN-LAST:event_clockButtonActionPerformed

    private void clockResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockResetButtonActionPerformed
        if (!this.clockState) {
            this.startTime = 0;
            this.clockTotal = 0;
        } else {
            this.startTime = System.currentTimeMillis();
            this.clockTotal = 0;
        }
        this.updateClock("00:00:00");
        this.updateRunningTotal("$0.00");
        this.updateBillingTotal("$0.00");
        this.updateBillingHours("0.00");
    }//GEN-LAST:event_clockResetButtonActionPerformed

    public void updateClock(String value) {
        this.clockValueLabel.setText(value);
    }

    public void updateRunningTotal(String value) {
        this.runningTotalValueLabel.setText(value);
    }

    public void updateBillingTotal(String value) {
        this.billableAmountValueLabel.setText(value);
    }

    public void updateBillingHours(String value) {
        this.billableHoursValueLabel.setText(value);
    }

    public String calculateTotal(long seconds, double rate, long min) {
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
    
    public double getBillableHours(long seconds, long min) {
        double coeff = (3600 / ((double) min));
        double hours = Math.round((((double) seconds) / 60 / 60) * coeff) / coeff;
        return hours;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new mainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel billableAmountLabel;
    private javax.swing.JLabel billableAmountValueLabel;
    private javax.swing.JLabel billableHoursLabel;
    private javax.swing.JLabel billableHoursValueLabel;
    private javax.swing.JButton clockButton;
    private javax.swing.JButton clockResetButton;
    private javax.swing.JLabel clockValueLabel;
    private javax.swing.JLabel rateCurrencyLabel;
    private javax.swing.JLabel rateLabel;
    private javax.swing.JLabel ratePerLabel;
    private javax.swing.JTextField rateTextField;
    private javax.swing.JLabel runningTotalLabel;
    private javax.swing.JLabel runningTotalValueLabel;
    // End of variables declaration//GEN-END:variables
}
