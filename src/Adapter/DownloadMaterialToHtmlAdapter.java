package Adapter;

public class DownloadMaterialToHtmlAdapter implements DownloadMaterial {
    private HTMLSaver htmlSaver;
    public DownloadMaterialToHtmlAdapter(HTMLSaver htmlSaver) {
        this.htmlSaver = htmlSaver;
    }
    @Override
    public void saveMaterial() {
        htmlSaver.saveToHtml();
    }
}
