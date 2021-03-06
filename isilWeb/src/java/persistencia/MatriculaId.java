package persistencia;
// Generated 07/04/2010 08:17:43 PM by Hibernate Tools 3.2.1.GA



/**
 * MatriculaId generated by hbm2java
 */
public class MatriculaId  implements java.io.Serializable {


     private String semestre;
     private String curso;
     private int grupo;
     private String alumno;

    public MatriculaId() {
    }

    public MatriculaId(String semestre, String curso, int grupo, String alumno) {
       this.semestre = semestre;
       this.curso = curso;
       this.grupo = grupo;
       this.alumno = alumno;
    }
   
    public String getSemestre() {
        return this.semestre;
    }
    
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    public String getCurso() {
        return this.curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }
    public String getAlumno() {
        return this.alumno;
    }
    
    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MatriculaId) ) return false;
		 MatriculaId castOther = ( MatriculaId ) other; 
         
		 return ( (this.getSemestre()==castOther.getSemestre()) || ( this.getSemestre()!=null && castOther.getSemestre()!=null && this.getSemestre().equals(castOther.getSemestre()) ) )
 && ( (this.getCurso()==castOther.getCurso()) || ( this.getCurso()!=null && castOther.getCurso()!=null && this.getCurso().equals(castOther.getCurso()) ) )
 && (this.getGrupo()==castOther.getGrupo())
 && ( (this.getAlumno()==castOther.getAlumno()) || ( this.getAlumno()!=null && castOther.getAlumno()!=null && this.getAlumno().equals(castOther.getAlumno()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSemestre() == null ? 0 : this.getSemestre().hashCode() );
         result = 37 * result + ( getCurso() == null ? 0 : this.getCurso().hashCode() );
         result = 37 * result + this.getGrupo();
         result = 37 * result + ( getAlumno() == null ? 0 : this.getAlumno().hashCode() );
         return result;
   }   


}


