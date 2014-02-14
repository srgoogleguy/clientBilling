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

/**
 *
 * Client Billing Tool
 * A simple tool written in Java for calculating your hourly billable hours
 * 
 * @version 0.1.0
 * @author Sherif Ramadan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mainWindow form = new mainWindow();
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }
}
