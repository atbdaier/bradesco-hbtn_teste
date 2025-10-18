import java.util.Date;

public class Person {
    private String name;
    private String surname;

    private Date birthDate;

    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;

    private float salary;

    public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
        this.salary = salary;
    }

    public String fullName() {
        return name + " " + surname;
    }

    public float calculateYearlySalary(){
        return salary * 12;
    }

    public boolean isMEI(){

        return ( (calculateYearlySalary() < 130000)
                && isMaiorDe18(birthDate)
                && (!anotherCompanyOwner)
                && (!pensioner)
                && (!publicServer) );
    }

    public static boolean isMaiorDe18(Date dataNascimento) {
        long tempoAtual = System.currentTimeMillis();
        long tempoNascimento = dataNascimento.getTime();
        long diferencaTempo = tempoAtual - tempoNascimento;
        long idadeEmMilissegundosPorAno = 1000L * 60 * 60 * 24 * 365; // 1 ano em milissegundos
        long idade = diferencaTempo / idadeEmMilissegundosPorAno;
        return idade > 18;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public boolean isPublicServer() {
        return publicServer;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
