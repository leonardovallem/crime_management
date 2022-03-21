package controle;

import java.util.List;

public class StringCT {
    public void insert(String c) {
        StringDAO dao = new StringDAO();
        dao.insert(c);
    }

    public void update(String c) {
        StringDAO dao = new StringDAO();
        dao.update(c);
    }

    public void delete(String c) {
        StringDAO dao = new StringDAO();
//        dao.delete(c.getId());
    }

    public String select(String nomebusca) {
        StringDAO dao = new StringDAO();
        String c = (String) dao.select(nomebusca);
        return c;
    }

    public List<String> getStrings() {
        StringDAO dao = new StringDAO();
        List<String> c = dao.getStrings();
        return c;

    }
}