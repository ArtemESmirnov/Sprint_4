public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        int spacesCount = 0;
        if(name.length() < 3 || name.length() > 19)
            return false;
        if(name.charAt(0) == ' ' || name.charAt(name.length() - 1) == ' ')
            return false;
        for (int i = 0; i < name.length(); i++)
            if(name.charAt(i) == ' ')
                spacesCount++;
        return spacesCount == 1;
    }
}
