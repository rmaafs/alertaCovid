/**
 * Rodrigo Maafs | AppsCamelot 2020
 */

package alertacovid;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Maafs
 */
public class Notificacion {
    
    public Notificacion(String title, String msg) {
        send(title, msg);
    }
    
    public void send(String title, String msg) {
        JOptionPane.showMessageDialog(null, msg, title, 0);
    }
}
