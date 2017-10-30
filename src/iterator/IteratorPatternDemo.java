package iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        int counter = 0;

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println(++counter + ".Name: " + name);
        }
    }
}
