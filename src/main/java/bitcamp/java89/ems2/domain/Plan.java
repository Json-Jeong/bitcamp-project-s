package bitcamp.java89.ems2.domain;

public class Plan extends ContentsHeader{

  private static final long serialVersionUID = 1L;
  protected Object planMap;
  protected String planName;
  protected String planImage;
  
  public String getPlanName() {
    return planName;
  }
  public void setPlanName(String planName) {
    this.planName = planName;
  }
  public Object getPlanMap() {
    return planMap;
  }
  public void setPlanMap(Object planMap) {
    this.planMap = planMap;
  }
  public String getPlanImage() {
    return planImage;
  }
  public void setPlanImage(String planImage) {
    this.planImage = planImage;
  }
}