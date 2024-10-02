interface Button {
    void render();
}
class DarkThemeButton implements Button {
    public void render() {
        System.out.println("Rendering Dark Theme Button");
    }
}

class LightThemeButton implements Button {
    public void render() {
        System.out.println("Rendering Light Theme Button");
    }
}