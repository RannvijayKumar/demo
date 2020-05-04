package in.cg.demo.models;


public class SearchQuery {
	private int routeId;
	private String src;
	private String dst;
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getDst() {
		return dst;
	}
	public void setDst(String dst) {
		this.dst = dst;
	}
	@Override
	public String toString() {
		return "SearchQuery [routeId=" + routeId + ", src=" + src + ", dst=" + dst + "]";
	}
	public SearchQuery(int routeId, String src, String dst) {
		super();
		this.routeId = routeId;
		this.src = src;
		this.dst = dst;
	}
	public SearchQuery() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
