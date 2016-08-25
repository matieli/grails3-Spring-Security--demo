// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName='blog.User'
grails.plugin.springsecurity.authority.className='blog.Role'
grails.plugin.springsecurity.userLookup.authorityJoinClassName='blog.UserRole'

grails.plugin.springsecurity.securityConfigType = 'InterceptUrlMap'

grails.plugin.springsecurity.logout.postOnly = false

//grails.plugin.springsecurity.controllerAnnotations.staticRules = [
//        [pattern: '/',               access: ['permitAll']],
//        [pattern: '/error',          access: ['permitAll']],
//        [pattern: '/index',          access: ['permitAll']],
//        [pattern: '/index.gsp',      access: ['permitAll']],
//        [pattern: '/shutdown',       access: ['permitAll']],
//        [pattern: '/assets/**',      access: ['permitAll']],
//        [pattern: '/**/js/**',       access: ['permitAll']],
//        [pattern: '/**/css/**',      access: ['permitAll']],
//        [pattern: '/**/images/**',   access: ['permitAll']],
//        [pattern: '/**/favicon.ico', access: ['permitAll']],
//        [pattern: '/book/**',       access: ['ROLE_ADMIN', 'isFullyAuthenticated()']]
//]
grails.plugin.springsecurity.interceptUrlMap = [
       // [pattern: '/',               access: ['permitAll']],
        [pattern: '/error',          access: ['permitAll']],
        //[pattern: '/index',          access: ['permitAll']],
        //[pattern: '/index.gsp',      access: ['permitAll']],
        [pattern: '/shutdown',       access: ['permitAll']],
        [pattern: '/dbconsole',       access: ['permitAll']],
        [pattern: '/dbconsole/**',       access: ['permitAll']],
        [pattern: '/assets/**',      access: ['permitAll']],
        [pattern: '/**/js/**',       access: ['permitAll']],
        [pattern: '/**/css/**',      access: ['permitAll']],
        [pattern: '/**/images/**',   access: ['permitAll']],
        [pattern: '/**/favicon.ico', access: ['permitAll']],
        [pattern: '/login',          access: ['permitAll']],
        [pattern: '/login/**',       access: ['permitAll']],
        [pattern: '/logout',         access: ['permitAll']],
        [pattern: '/logout/**',      access: ['permitAll']],
        [pattern: '/book/**',       access: ['ROLE_ADMIN', 'isFullyAuthenticated()']]
]