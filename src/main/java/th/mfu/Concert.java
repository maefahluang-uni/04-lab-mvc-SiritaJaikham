package th.mfu;

import java.util.Date;

public class Concert {

    //TODO: add attributes
        private int id;
        private String title;
        private String performer;
        private Date date;
        private String description;
        
        
    public Concert() {
    }
    public Concert(String title, String description) {
        //TODO: set attributes
        
        this.title = title;
        this.description = description;

    }
    
    //TODO: add getters and setters for all attributes
    // You can use Source action/generate getter setter function
        public String getTitle(){
            return title;
        }
        public String getDescription(){
            return description;
        }
        public String getPerformer(){
            return performer;
        }
        public void setPerformer(String performer){
            this.performer = performer;
        }
        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id = id;
        }
        public Date getDate(){
            return date;
        }
        public void setDate(Date date){
            this.date = date;
        }
        
}
