package day25.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemoUsingPatternMatcher {
	public static void main(String[] args) {
		String content = "Subject: Weekly Operations Update\r\n"
				+ "\r\n"
				+ "Hi team,\r\n"
				+ "\r\n"
				+ "Please reach out to john.doe@example.com for project Alpha updates. He mentioned that the deployment scheduled on 12/04/2026 might be delayed.\r\n"
				+ "\r\n"
				+ "Also, Jane (jane_smith123@gmail.com) has shared the latest marketing report. You can find it in the shared drive under /reports/Q2.\r\n"
				+ "\r\n"
				+ "For urgent production issues, contact support@my-site.net or call +91-9876543210.\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "Meeting Notes (15 April 2026):\r\n"
				+ "\r\n"
				+ "- Attendees: alex+promo@yahoo.com, hr.department@corporate.org, dev_ops@tech-company.dev\r\n"
				+ "- Budget approved: ₹5,00,000\r\n"
				+ "- Next review date: 25/04/2026\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "Customer Queries:\r\n"
				+ "\r\n"
				+ "1. Mr. Ravi Kumar (ravi.kumar@business.co.in) reported a login failure at 10:45 AM.\r\n"
				+ "2. Ms. Anjali (anjali@startup.ai) requested a feature update.\r\n"
				+ "3. Complaint received from user.test@outlook.com regarding billing mismatch of ₹1,250.\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "System Logs:\r\n"
				+ "\r\n"
				+ "[INFO] 2026-04-14 09:12:33 - User login success: first.last@domain.io\r\n"
				+ "[ERROR] 2026-04-14 09:15:10 - Failed attempt: invalid-email.com\r\n"
				+ "[WARN] 2026-04-14 09:18:45 - Suspicious activity from user@@doubleat.com\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "Internal Contacts:\r\n"
				+ "\r\n"
				+ "IT Support: admin@website.co\r\n"
				+ "Finance: billing@finance.co.uk\r\n"
				+ "Media: press@mediahouse.com\r\n"
				+ "Feedback: feedback@product.io\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "Random Notes:\r\n"
				+ "\r\n"
				+ "The server IP 192.168.1.1 responded in 120ms.\r\n"
				+ "Backup completed at 03:45 AM.\r\n"
				+ "Test accounts: alpha1@test.com, beta.user@demo.org, gamma-ray@science.net\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "Reminder:\r\n"
				+ "\r\n"
				+ "Send all reports to team_lead@project.net before Friday.\r\n"
				+ "Avoid sending credentials over email like password123 or admin@123.\r\n"
				+ "\r\n"
				+ "---\r\n"
				+ "\r\n"
				+ "End of report.\r\n"
				+ "\r\n"
				+ "Regards,  \r\n"
				+ "Operations Team  \r\n"
				+ "Contact: no-reply@notifications.app";
		
		Pattern p = Pattern.compile("[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+");
		Matcher m = p.matcher(content);
		int count = 0;
		
		while(m.find()) {
			count++;
			System.out.println("Email "+count +" = "+m.group());
		}
	}
}