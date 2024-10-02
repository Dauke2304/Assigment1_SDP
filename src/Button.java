
interface Button {
    void render();
}


class DarkThemeButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Dark Theme Button");
    }
}

interface UIFactory {
    Button createButton();
}

class DarkThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkThemeButton();
    }
}
