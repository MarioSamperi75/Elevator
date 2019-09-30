package se.nackademin;

/**
 * En klass som tillåter skapelsen och användning av en simulerad hiss.
 * Klassen innehåller 2 konstruktorer och 2 metoder.
 */
public class Elevator {
    private int level;

    /**
     *Kontruktor utan parametrar. Objektet skapas med defaultvärdet för instansvariabeln level.
     */
    public Elevator() {
        this.level=level;
    }

    /**
     * Konstructor med en parameter.
     * Kontruktor tillåter att ett argument ska kunna anges vid objekt skapelsen.
     * Konstruktor testar argumentet som den får:
     * i intervallet (-2:10) tilldelar konstruktorn värdet till instansvariabeln.
     * I övriga fallen, genererar den en exception som kommer att fångas i ElevatorMain.
     * @param level
     * aktuella våningen av hissen
     */
    public Elevator(int level) {
        if (level<-2 || level>10)
            throw new IllegalArgumentException("level not found");
        else
            this.level=level;
//       this.goTo(level);
    }


    /**
     * En set metod som testar argumentet som den får.
     * Utanför intervallet -2:10, genererar den en exception som ska fångas i ElevatorMain.
     * Annars tilldelar metoden värdet till instansvariabeln
     * och skriver ut ett meddelande som urskijls enligt några villkor.
     * @param level
     * aktuella våningen av hissen
     */
    public void  goTo (int level) {   //setLevel
        if (level < -2 || level > 10)
            throw new IllegalArgumentException("level not found");
        else if (level<this.level) {
            System.out.println("Hissen åker ner till våning " + level);
            this.level = level;
        }else if (level>this.level) {
            System.out.println("Hissen åker upp till våning " + level);
            this.level = level;
        }else
            System.out.println("Hissen är redan på våning " + level);

    }

    /**
     * En get metod
     * @return level - aktuella våningen av hissen
     */
    public int where() {                  //getLevel
        return this.level;
        }

}



