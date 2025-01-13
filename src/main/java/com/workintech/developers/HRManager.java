package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper [] seniorDevelopers;

    // Constructor
    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[5];
        midDevelopers = new MidDeveloper[5];
        seniorDevelopers = new SeniorDeveloper[5];
    }

    // JuniorDeveloper ekleme
    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        for(int i=0; i < juniorDevelopers.length; i++) {
            if(juniorDevelopers[i] == null) {
                juniorDevelopers[i] = juniorDeveloper;
                System.out.println(juniorDeveloper.getName() + " has been added to Junior Developers.");
                return;
            }
        }
        System.out.println("No space available for Junior Developer.");
    }

    // MidDeveloper ekleme
    public void addEmployee(MidDeveloper midDeveloper) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = midDeveloper;
                System.out.println(midDeveloper.getName() + " has been added to Mid Developers.");
                return;
            }
        }
        System.out.println("No space available for Mid Developer.");
    }

    // SeniorDeveloper ekleme
    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = seniorDeveloper;
                System.out.println(seniorDeveloper.getName() + " has been added to Senior Developers.");
                return;
            }
        }
        System.out.println("No space available for Senior Developer.");
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing the developers.");

        // Çalışan geliştiricilerle işleme devam etme
        for (JuniorDeveloper junior : juniorDevelopers) {
            if (junior != null) {
                junior.work();
            }
        }

        for (MidDeveloper mid : midDevelopers) {
            if (mid != null) {
                mid.work();
            }
        }

        for (SeniorDeveloper senior : seniorDevelopers) {
            if (senior != null) {
                senior.work();
            }
        }
    }
}
