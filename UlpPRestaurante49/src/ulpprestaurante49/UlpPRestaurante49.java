package ulpprestaurante49;

import java.sql.Time;
import java.time.LocalDate;
import restaurante.Entidades.Producto;
import restaurante.Entidades.Reserva;
import restaurante.accesoData.MeseroData;
import restaurante.accesoData.ProductoData;
import restaurante.accesoData.ReservaData;

public class UlpPRestaurante49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoData a = new ProductoData();
//        Producto x = new Producto("PIPO", 40, 3, true);
//        a.crearProducto(x);
//        System.out.println( a.buscarProductoId(1).toString());
//         Producto d = new Producto("PIPO", 40, 3, true);
//        a.crearProducto(d);
//        a.eliminarProducto(2);
//        for (Producto listaProducto : a.listaProductos()) {
//            System.out.println(listaProducto.toString());
//            System.out.println("lala");
//        }
//      Producto x = new Producto(1,"PEPE", 40.1, 3, true);
//      a.modificarProducto(x);

//a.cambiarEstadoProductoFalse(1);
//a.cambiarEstadoProductoTrue(1);
        ReservaData z = new ReservaData();
        Reserva res = new Reserva(123456, "BOMBOM", "Asesino", 1000, LocalDate.of(2000, 4, 21), new Time(11, 36, 0), true);
//        Reserva res2 = new Reserva(5,1321, "González", "Roberto", 4, LocalDate.now(), new Time(13, 25, 0), true);
//        z.crearReserva(res);
//        z.modificarReserva(res2);
//         z.eliminarReserva(3);
//        for (Reserva listaReserva : z.listaReservasXFecha(res.getFecha())) {
//            System.out.println(listaReserva.toString());

        MeseroData mesero = new MeseroData();
//    Mesero mes = new Mesero("Fer", "Ferchu", "LaWaching");
//   mesero.crearMesero(mes);
//        System.out.println(mesero.buscarMeseroPorId(1).toString());

//        Mesero mes = new Mesero("Messi", "Numberone12", "Lio");
//        mesero.crearMesero(mes);
//        System.out.println(mesero.buscarMeseroPorId(1).toString());
//       mesero.eliminarMesero(1);
//        for(Mesero listaMeseros : mesero.listaMesero()){
//            System.out.println(listaMeseros.toString());
//        }
//    Mesero meserito = new Mesero(2,"Fer", "Ferchus", "LaOne");
//    mesero.modificarMesero(meserito);
//    
    }
}

