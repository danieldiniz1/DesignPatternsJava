package adapter;

import java.util.Map;

public interface Adapter {

    void post(String url, Map<String,Object> dados);
}
