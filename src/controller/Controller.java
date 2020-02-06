package controller;

import java.util.Scanner;

import model.logic.Comparendo;
import model.logic.Modelo;
import view.View;

public class Controller {

	public final static String RUTA_DATOS_COMPLETOS = "./data/comparendos_dei_2018.geojson";
	public final static String RUTA_DATOS_SMALL = "./data/comparendos_dei_2018_small.geojson";


	/* Instancia del Modelo*/
	private Modelo modelo;

	/* Instancia de la Vista*/
	private View view;

	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */


	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
	}

	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){
			case 1:
				modelo.cargarComparendos(RUTA_DATOS_SMALL); 
				view.printMessage("Datos de comparendos cargados.");
				view.printMessage("Numero total de comparendos " + modelo.darTamano() + "\n---------");						
				break;

			case 2:
				view.printMessage("--------- \nDar ID del comparendo a buscar: ");
				dato = lector.next();

				int id = Integer.parseInt(dato);
				Comparendo buscado = modelo.buscar(id);

				if(buscado !=  null)
				{
					view.printMessage("Comparendo encontrado");
					view.printMessage("ID: " + buscado.darObjectID());
					view.printMessage("Fecha: " + buscado.darFecha());
					view.printMessage("Medio dete: " + buscado.darMedioDete());
					view.printMessage("Tipo del vehículo: " + buscado.darClaseVehiculo());
					view.printMessage("Tipo de servicio: " + buscado.darTipoServicio());
					view.printMessage("Infracción: " + buscado.darInfraccion());
					view.printMessage("Descripción de la infracción: " + buscado.darDesInfraccion() );
					view.printMessage("Localidad: " + buscado.darLocalidad());
				}

				else
				{
					view.printMessage("Comparendo NO encontrado");
				}

				break;

			case 3:

				view.printMessage("--------- \n Hasta pronto !! \n---------"); 
				lector.close();
				fin = true;
				break;	

			default: 
				view.printMessage("--------- \n Opcion Invalida !! \n---------");
				break;
			}
		}

	}	
}
