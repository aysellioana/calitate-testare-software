package Composite;

import java.util.ArrayList;
import java.util.List;

class Panel implements Component{
    private List<Component> components = new ArrayList<>();
    public void adaugaComponenta(Component componenta){
        components.add(componenta);
    }
    public void eliminaComponenta(Component componenta){
        components.remove(componenta);
    }
    @Override
    public void render() {
        System.out.println("Se afiseaza panoul");
        for(Component componenta: components){
            componenta.render();
        }
    }
}