public class ContatoLista {
    private Node noo;

    public ContatoLista() {
        this.noo = null;
    }

    public void addContact(Contact contact) {
        Node newNode = new Node(contact);
        if (noo == null) {
            noo = newNode;
        } else {
            Node atual = noo;
            while (atual.getNext() != null) {
                atual = atual.getNext();
            }
            atual.setNext(newNode);
        }
    }

    public Contact searchContact(String nomeOuNumero) {
        Node atual = noo;
        while (atual != null) {
            Contact contact = atual.getContact();
            if (contact.getnome().equals(nomeOuNumero) || contact.getnumeroTelefone().equals(nomeOuNumero)) {
                return contact;
            }
            atual = atual.getNext();
        }
        return null;
    }

    public boolean removeContact(String nomeOuNumero) {
        if (noo == null) return false;

        if (noo.getContact().getnome().equals(nomeOuNumero) || noo.getContact().getnumeroTelefone().equals(nomeOuNumero)) {
            noo = noo.getNext();
            return true;
        }

        Node atual = noo;
        while (atual.getNext() != null &&
                !atual.getNext().getContact().getnome().equals(nomeOuNumero) &&
                !atual.getNext().getContact().getnumeroTelefone().equals(nomeOuNumero)) {
            atual = atual.getNext();
        }

        if (atual.getNext() != null) {
            atual.setNext(atual.getNext().getNext());
            return true;
        }
        return false;
    }

    public void listContacts() {
        Node atual = noo;
        while (atual != null) {
            System.out.println(atual.getContact());
            atual = atual.getNext();
        }
    }
}
