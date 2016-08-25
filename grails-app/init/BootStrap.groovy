import blog.Book
import blog.Role
import blog.User
import blog.UserRole

class BootStrap {

    def init = { servletContext ->

        Role admin = new Role("ROLE_ADMIN").save()
        User user = new User("user", "pass").save()
        UserRole.create(user, admin, true)


        new Book(name : "Java 编程思想", desc: "Java 编程思想" ,page: 500).save()
        new Book(name : "PHP 编程思想", desc: "PHP 编程思想" ,page: 50).save()
        new Book(name : "Ruby 编程思想", desc: "Ruby 编程思想" ,page: 100).save()
        new Book(name : "Groovy 编程思想", desc: "Groovy 编程思想" ,page: 200).save()
    }
    def destroy = {
    }
}
