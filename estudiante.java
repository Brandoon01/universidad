package Universidad;

public class estudiante extends UniversidadWeb implements info{
    private String NombreAlumno;
    private int edad;
    
    public estudiante(){
        NombreAlumno="Brandon buitrago";
        edad=19;
    }
    public estudiante(String NombreAlumno,int edad, String nombreUniversidadWeb, String fundadorUniversidadWeb,int carrerasUniversidadWeb ){
        super(nombreUniversidadWeb,fundadorUniversidadWeb,carrerasUniversidadWeb);
        this.NombreAlumno=NombreAlumno;
        this.edad=edad;
    };

    public String getNombreAlumno() {
        return NombreAlumno;
    }

    public void setNombreAlumno(String NombreAlumno) {
        this.NombreAlumno = NombreAlumno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
@Override
    public String obtenerInformacion(){
        return "nombre del alumno"+NombreAlumno+"\nedad"+edad+"\nuniversidad"+getNombre()+
        "\nFundador"+getFundador()+"\nCarreras"+getCarreras();
    }
    public static void main (String[] args){
        estudiante estudiante1= new estudiante();
        UniversidadWeb universidad1=new UniversidadWeb();
        
        System.out.println("Nombre del alumno: "+estudiante1.getNombreAlumno());
        System.out.println("Edad del estudiante: "+estudiante1.getEdad());
        System.out.println("Nombre Universidad: "+universidad1.getNombre());
        System.out.println("Fundador: "+universidad1.getFundador());
        System.out.println("Carreras: "+universidad1.getCarreras());
    }
}
