public class Revision {
    private String revisionId;
    private String details;

    public Revision(String revisionId, String details) {
        this.revisionId = revisionId;
        this.details = details;
    }
    public String getRevisionId() {
        return revisionId;
    }
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    @Override
    public String toString() {
        return "Revision{revisionId='" + revisionId + '\'' + ", details='" + details + '\'' + '}';
    }
}
