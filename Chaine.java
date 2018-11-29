public class liste_chainee 
{
    int number;
    String Liste;
    Chaine First;
    Chaine Last;
    Chaine next;
    Chaine prev;

    Chaine ()
    {

    }

    Chaine (int number, String Liste)
    {
        this.number = number;
        this.Liste = Liste;
    }

    Chaine (int number, String Liste, Chaine next, Chaine prev, Chaine First, Chaine Last)
    {
        this.number = number;
        this.Liste = Liste;
        this.next = next;
        this.prev = prev;
        this.First = null;
        this.Last = null;
    }

    Chaine getNextChaine()
    {
        return this.next;
    }

    Chaine setNextChaine()
    {
        this.next = next;
    }

    Chaine getPrevChaine()
    {
        return this.prev;
    }

    Chaine setPrevChaine()
    {
        this.prev = prev;
    }

    Int getNumberChaine()
    {
        return this.number;
    }

    Int setNumberChaine()
    {
        this.number = number;
    }

    String getListeChaine()
    {
        return this.Liste;
    }

    String setListeChaine()
    {
        this.Liste = Liste;
    }

    Chaine getFirstChaine()
    {
        return this.First;
    }

    Chaine setFirstChaine()
    {
        this.First = First;
    }

    Chaine getLastChaine()
    {
        return this.Last;
    }

    Chaine setLastChaine()
    {
        this.Last = Last;
    }

    void removeNextChaine()
    {
        this.next = this.next.getNextChaine;
    }

    void removePrevChaine()
    {
        this.prev = this.prev.getPrevChaine;
    }
}