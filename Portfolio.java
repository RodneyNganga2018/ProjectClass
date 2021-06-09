import java.util.ArrayList;
import java.util.Arrays;

public class Portfolio {
    private ArrayList<Project> projects;

    public Portfolio () {
        this.projects = new ArrayList<Project>();
    }
    public Portfolio (Project[] projects) {
        this.projects = new ArrayList<Project>(Arrays.asList(projects));
    }

    public ArrayList<Project> getPortfolio () {
        return projects;
    }

    public void setPortfolio (ArrayList<Project> projects) {
        this.projects = projects;
    }

    public void addProject (Project item) {
        this.projects.add(item);
    }

    public double getPortfolioCost() {
        double sum = 0;

        for (Project item : this.projects) {
            sum+= item.getInitialCost();
        }

        return sum;
    }

    public void showPortfolio() {
        for (Project item: this.projects) {
            System.out.println(item.elevatorPitch());
        }
        System.out.println(String.format("Total cost: %.2f", (this.getPortfolioCost())));
    }
}
