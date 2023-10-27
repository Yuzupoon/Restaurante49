package ulpprestaurante49;

import java.sql.Time;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Mesero;
import restaurante.Entidades.Pedido;
import restaurante.Entidades.Producto;
import restaurante.Entidades.ProductoXPedido;
import restaurante.Entidades.Reserva;
import restaurante.accesoData.MesaData;
import restaurante.accesoData.MeseroData;
import restaurante.accesoData.PedidoData;
import restaurante.accesoData.ProductoData;
import restaurante.accesoData.ProductoXPedidoData;
import restaurante.accesoData.ReservaData;
import ulpprestaurante49.vistas.AdmProducto;
import ulpprestaurante49.vistas.Home;
import ulpprestaurante49.vistas.MesPrincipal;
import ulpprestaurante49.vistas.PedidosTotales;
import ulpprestaurante49.vistas.ProductosDePedidos;

public class UlpPRestaurante49 {

    public static void main(String[] args) {
//        ProductoData a = new ProductoData();
//        Producto x = new Producto("MAMINENA", 104.3, 5, true);
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
//        ReservaData z = new ReservaData();
//        z.listaReservas();
//        Reserva res = new Reserva(123456, "BOMBOM", "Asesino", 1000, LocalDate.of(2000, 4, 21), new Time(11, 36, 0), true);
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
//        MeseroData mesero = new MeseroData();
//        mesero.listaMesero();
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
////    mesero.modificarMesero(meserito);
//        MesaData mesita = new MesaData();
//        Reserva resmuerta = new Reserva(1, 12345621, "BOMBOM", "Asesino", 1000, LocalDate.of(2000, 4, 21), new Time(11, 36, 0), true);
//        z.modificarReserva(resmuerta);
//        mesita.armarMesa(5, 4);
//    mesita.crearMesa(mesa2);
//    int cont = 0;
//    do{
//        cont++;
//        Mesa mesa2 = new Mesa(cont, resmuerta, 4, true);
//        mesita.crearMesa(mesa2);
//        System.out.println(cont);
//    }while(cont != 20);
        //CAMBIO IMPORTANTE CAMBIO EN LA BASE DE DATOS EN PRODUCTO A CANTIDAD POR STOCK
        //DE LA BASE DE DATOS BORRE DE LA TABLA PEDIDOS AL IDPRODUCTO

        ProductoXPedidoData proxped = new ProductoXPedidoData();
//        System.out.println(proxped.MostrarProductos(1));
//        proxped.crearPedidoDeProducto( 1,"PEPE", 1);
//        for (ProductoXPedido MostrarProducto :proxped.MostrarProductos(1)) {
//            System.out.println(MostrarProducto.getProducto().getNombre());
//            System.out.println(MostrarProducto.getCantidad());              
//        }
//        Producto nuevo = a.buscarProductoId(1);   
//        Producto aa = new Producto();
//        aa.modificarProducto(1);
//       nuevo.restarStock(1);
//       nuevo.cargarStock(20);
//       nuevo.restarStock(5);
//
//        Mesa mesa1 = new Mesa(2, resmuerta, 5, true);
//        Mesero mes = new Mesero(2, "Fer", "Ferchu", "LaWaching");
//        Mesero mesero1 = new Mesero(3, "EL SANGU", "EL SANGULONGONTE", "PASSWORD");
//
//        PedidoData pedi = new PedidoData();
//        System.out.println(pedi.listadePedidos());
//        pedi.crearPedido(1, 1, "activo", 0.0);

//        Pedido juan = new Pedido(3, mesa1, mesero1, "activo");
//        pedi.eliminarPedido(juan);
//        pedi.modificarPedido(juan);
//        for (Pedido listadePedido : pedi.listadePedidos()) {
//            System.out.println(listadePedido.toString());
//            System.out.println("===================================");
//        }
//
        Home principal = new Home();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);

//            AdmProducto produ = new AdmProducto();
//            produ.setVisible(true);
//            produ.setLocationRelativeTo(null);
//
//          MesPrincipal mesa = new MesPrincipal();
//          mesa.setVisible(true);
//          mesa.setLocationRelativeTo(null);
//          
//          PedidosTotales total = new PedidosTotales();
//          total.setVisible(true);
//          total.setLocationRelativeTo(null);

//             ProductosDePedidos productos = new ProductosDePedidos();
//             productos.setVisible(true);
//             productos.setLocationRelativeTo(null);

    }

    
      
       
   
}
