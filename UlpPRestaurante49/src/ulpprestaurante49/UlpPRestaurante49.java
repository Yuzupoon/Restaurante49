package ulpprestaurante49;

import java.sql.Time;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import restaurante.Entidades.Producto;
import restaurante.Entidades.ProductoXPedido;
import restaurante.Entidades.Reserva;
import restaurante.accesoData.MesaData;
import restaurante.accesoData.MeseroData;
import restaurante.accesoData.ProductoData;
import restaurante.accesoData.ProductoXPedidoData;
import restaurante.accesoData.ReservaData;

public class UlpPRestaurante49 {

    //CAMBIO IMPORTANTE CAMBIE EN LA BASE DE DATOS EN PRODUCTO A CANTIDAD POR STOCK
    //DE LA BASE DE DATOS BORRE DE LA TABLA PEDIDOS AL IDPRODUCTO
    public static void main(String[] args) {
        ProductoData a = new ProductoData();
        Producto x = new Producto("MAMINENA", 104.3,5, true);
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
//    }
//Reserva reserva1= z.buscarReservaID(1);
//Reserva reserva2=z.buscarReservaID(6);
//        if (reserva1.getHora().getHours()!=reserva2.getHora().getHours()) {
//            JOptionPane.showMessageDialog(null, "LAS HORAS NO SON IGUALES");
//        }
//        if (reserva1.getHora().getMinutes()==reserva2.getHora().getMinutes()) {
//            JOptionPane.showMessageDialog(null, "LOS MINUTOS SON IGUALES");
//        }else{
//            JOptionPane.showMessageDialog(null, "NO SON IGUALES");
//        }
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
        MesaData mesita = new MesaData();
        Reserva resmuerta = new Reserva(1, 123456, "BOMBOM", "Asesino", 1000, LocalDate.of(2000, 4, 21), new Time(11, 36, 0), true);
//        mesita.armarMesa(5, 4);
//    mesita.crearMesa(mesa2);
//    int cont = 0;
//    do{
//        cont++;
//        Mesa mesa2 = new Mesa(cont, resmuerta, 4, true);
//        mesita.crearMesa(mesa2);
//        System.out.println(cont);
//    }while(cont != 20
    //CAMBIO IMPORTANTE CAMBIO EN LA BASE DE DATOS EN PRODUCTO A CANTIDAD POR STOCK
     //DE LA BASE DE DATOS BORRE DE LA TABLA PEDIDOS AL IDPRODUCTO
    
        ProductoXPedidoData proxped = new ProductoXPedidoData();
//        proxped.crearPedidoDeProducto(1, 1, 1);
        for (ProductoXPedido MostrarProducto :proxped.MostrarProductos(1)) {
            System.out.println(MostrarProducto.getProducto().getNombre());
            System.out.println(MostrarProducto.getCantidad());              
        }
        Producto nuevo = a.buscarProductoId(1);       
//        nuevo.restarStock(1);
//       nuevo.cargarStock(20);
//       nuevo.restarStock(5);
      
        
    } 

    }

