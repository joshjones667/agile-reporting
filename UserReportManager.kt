object UserReportManager {

    val userReportService: UserReportService = UserReportService()

    fun sendAllUsersReports(users: List<User>) {
        for (user in users) {
            for (userReport in user.reports.orEmpty()) {
                userReportService.sendReport(userReport)
            }
        }
    }

}
