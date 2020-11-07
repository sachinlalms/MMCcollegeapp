package com.example.marymathauser.ebook;

public class EbookData {

    private String pdfTitle,pdfUrl;

    public EbookData() {
    }

    public EbookData(String pdfTitle, String pdfUrl) {
        this.pdfTitle = pdfTitle;
        this.pdfUrl = pdfUrl;
    }

    public String getPdfTitle() {
        return pdfTitle;
    }

    public void setPdfTitle(String pdfTitle) {
        this.pdfTitle = pdfTitle;
    }

    public String getpdfUrl() {
        return pdfUrl;
    }

    public void setpdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }
}
