
class ArticuloCientifico {
	private String nombreArticulo;
	private String autor;
	private String palabrasClaves;
	private String nombrePublicacion;
	private int año;
	private String resumen;
	
	public ArticuloCientifico (String nombreArticulo, String autor){
		this.nombreArticulo=nombreArticulo;
		this.autor=autor;
	}

	
	
	public ArticuloCientifico (String nombreArticulo, String autor,String palabrasClaves,String nombrePublicacion,int año){
		this(nombreArticulo,autor);
		this.palabrasClaves=palabrasClaves;
		this.nombrePublicacion=nombrePublicacion;
		this.año=año;
	}
	public ArticuloCientifico (String nombreArticulo, String autor,String palabrasClaves,String nombrePublicacion,int año,String resumen){
		this(nombreArticulo,autor,palabrasClaves, nombrePublicacion,año);
		this.resumen=resumen;
	}
	public void imprimirAtributos() {
		System.out.print("Nombre del articulo: "+this.nombreArticulo+"\nAutor: "+ this.autor+"\nPalabras Claves: "+this.palabrasClaves+"\nNombre de la Publicacion:"+this.nombrePublicacion+"\nAño:"+this.año+"\nResumen:"+this.resumen);
	}
	
}
