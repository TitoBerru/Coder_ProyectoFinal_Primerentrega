package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DAO;
import com.coderhouse.models.Cliente;
import com.coderhouse.models.Producto;
import com.coderhouse.models.Venta;

@SpringBootApplication
public class FacturacionPrimeraEntregaBerruttiApplication  implements CommandLineRunner{
	
	@Autowired
	private DAO dao;
	
	public static void main(String[] args) {
		SpringApplication.run(FacturacionPrimeraEntregaBerruttiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			System.out.println("La aplicación se ha iniciado correctamente...");
			
			Producto producto1 = new Producto("Camara Fotos", 10, 1000, 5000, 10, true);
			Producto producto2 = new Producto("TV LED", 10, 1000, 15000, 10, true);
			Producto producto3 = new Producto("Notebook",10, 1000, 25000, 10, true);
			
			Cliente cliente1 = new Cliente("Pedro", "Serra", 22733334);
			Cliente cliente2 = new Cliente("Adrian", "Adriano", 21733334);
			Cliente cliente3 = new Cliente("Manuel", "Monserrat", 24733334);
			Cliente cliente4 = new Cliente("Catupecu", "Machu", 30123456);
			
			Venta venta1= new Venta(1L, 1L, 10, 1);
			Venta venta2= new Venta(3L, 2L, 100, 2);
			
			dao.persistirCliente(cliente1);
			dao.persistirCliente(cliente2);
			dao.persistirCliente(cliente3);
			
			dao.persistirProducto(producto1);
			dao.persistirProducto(producto2);
			dao.persistirProducto(producto3);
			
			dao.persistirVenta(venta1);
			dao.persistirVenta(venta2);
			
	} catch(Exception e) {
		e.printStackTrace(System.err);
	}
	
	

}
}
