import javax.swing.JOptionPane;
public class Auto  implements Conducir,Mantenimiento{

    @Override
    public void acelerar() {
         JOptionPane.showMessageDialog(null, "El auto esta siendo acelerado");
        System.out.println("El auto esta siendo acelerado ");
    }

    @Override
    public void frenar() {
      JOptionPane.showMessageDialog(null, "El auto esta siendo frenado");
       System.out.println("El auto esta siendo frenado ");
    }

    @Override
    public void embragar() {
      JOptionPane.showMessageDialog(null, "El auto esta siendo embragado");
       System.out.println("El auto esta siendo embragado");
    }

    @Override
    public void cambiarVelocidaddes() {
      JOptionPane.showMessageDialog(null, "El auto esta cambiando de velocidad");
       System.out.println("El auto esta cambiando de velocidad ");
    }

    @Override
    public void limpiar() {
      JOptionPane.showMessageDialog(null, "El auto esta siendo limpiado");
       System.out.println("El auto esta siendo limpiado");
    }

    @Override
    public void cambiarAceite() {
      JOptionPane.showMessageDialog(null, "Al auto le estan cambiando el aceite");
       System.out.println("Al auto le estan cambiando el aceite");
    }

    @Override
    public void colocarAgua() {
      JOptionPane.showMessageDialog(null, "Al auto le estan cambiando el agua");
      System.out.println("Al auto le estan cambiando el agua");
    }

    @Override
    public void encender() {
      JOptionPane.showMessageDialog(null, "El auto esta siendo encendido");
      System.out.println("El auto esta siendo encendido");
    }
 
}
