package _1_javaExerciseForGithub._1_javaBasic._0_javaLangObject;

/* l'oggetto Object è la radice della gerarchia delle classi.
Ogni classe ha Object come superclasse.
Tutti gli oggetti, compresi gli array implementno i metodi di questa classe.
Ciò significa che tutte le classi, ereditano delle funzionalità incorporate
che possono essere utilizzate o sovrascritte nel momento che vengono create nella classe.

Altro punto, tutte le classi create, ereditano da Object
per tanto possiamo dire che tutte le classi nascono cosi
	* public class Main extend java.lang.Object o Object
	La classe Object viene ereditata automaticamente
* */

public class Main {
    public static void main(String[] args) {
        Student s = new Student("max", 26);
        System.out.println(s.toString()); // -> verrà stampato il nome della classe e il codice Hash dell'oggetto
// quando un'instanza viene creata, viene assegnato un hashCode, questo ci dice se i nostri
// riferimenti multipli puntano ad una singola istanza, in altre parole è un meccanismo di confronto
// .Verrà stampata la posizione in memoria del nostro oggetto dopo che è stata fatta l'instanza della classe.

        System.out.println( "----"+"\n" );
        StudentPrimarySchool sp = new StudentPrimarySchool("Bimbo",10,"Guidotti");
        System.out.println(sp.toString());

    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
/*
@Override // sccrivere cosi oppure scrivere --> System.out.println(s.toString()); è la stessa cosa,
// perchè sto richiamando un metodo della superClasse
    public String toString(){
        return super.toString();
    }
*/
    @Override
    public String toString(){
        return "name:" + name + " age:" + age;
    }
}

// in questa classe quello che facciamo è sovrascrivere il toString, con i campi della classe StudentPrimary
class StudentPrimarySchool extends Student{
    private String parentName;

    public StudentPrimarySchool(String name, int age,String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString(){
        return parentName + "è il genitore di: " + super.toString();
    }

}
