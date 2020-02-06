package model.logic;

import java.io.FileReader;

import com.google.gson.*;
import model.data_structures.Node;
import model.data_structures.ILinkedList;
import model.data_structures.LinkedList;

/**
 * Definicion del modelo del mundo
 *
 */

public class Modelo 
{

	/**
	 * Atributos del modelo del mundo
	 */

	private LinkedList<Comparendo> comparendos;


	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */

	public Modelo()
	{
		comparendos = new LinkedList<Comparendo>();
	}


	/**
	 *
	 */

	public LinkedList<Comparendo> darComparendos()
	{
		return comparendos;
	}

	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return comparendos.darTamanio();
	}

	/**
	 * Carga los comparendos de acuerdo con el archivo pasado por parametro
	 * @param Archivo de los comparendos
	 */

	public void cargarComparendos(String pFile)
	{

		try
		{
			JsonParser parser = new JsonParser();
			FileReader fr = new FileReader(pFile);
			JsonArray datosComparendos = parser.parse(fr).getAsJsonObject().get("features").getAsJsonArray();

			for(JsonElement dato : datosComparendos)
			{
				JsonObject nuevo = dato.getAsJsonObject().get("properties").getAsJsonObject();

				int objectID = nuevo.get("OBJECTID").getAsInt();
				String fecha = nuevo.get("FECHA_HORA").getAsString();
				String medioDete = nuevo.get("MEDIO_DETE").getAsString();
				String clase = nuevo.get("CLASE_VEHI").getAsString();
				String tipo = nuevo.get("TIPO_SERVI").getAsString();
				String infraccion = nuevo.get("INFRACCION").getAsString();
				String desInfraccion = nuevo.get("DES_INFRAC").getAsString();
				String localidad = nuevo.get("LOCALIDAD").getAsString();

				Comparendo comparendo = new Comparendo(objectID, fecha, medioDete, clase, tipo, infraccion, desInfraccion, localidad);

				comparendos.agregarAlFinal(comparendo);
			}



		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

	}


	/**
	 * Requerimiento buscar un comparendo
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public Comparendo buscar(int pObjectID)
	{
		Node<Comparendo> actual = comparendos.darPrimerElemento();
		Node <Comparendo> buscado = null; 

		while(actual != null)
		{
			if(actual.darItem().darObjectID() == pObjectID)
			{
				return actual.darItem();
			}

			actual = actual.darSiguiente();
		}

		return null;

	}



}
