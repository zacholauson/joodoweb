[:h2 "The Grand Tour"]
[:p "Because of the amount of functionality that Joodo comes with out of the box, understaning how everthing works can be a little overwhelming if it is your first time seeing a Joodo project. This section will give an overview of the important parts of any Joodo project."]

[:h3 "Project.clj"]
[:p "The heart of any Leiningen project is the project.clj file. This file lists information about your project. You can add descriptions, change version numbers, add dependencies, and much more in this file. More info about the project.clj file can be found on the " [:a {:href "https://github.com/technomancy/leiningen/blob/master/README.md" :target "_blank"} "latest tutorial"] " on Leiningen's github account."]

[:h3 "Core.clj"]
[:p "The next most important file is the core.clj file buried in your src/ directory. By default there are three sections of core.clj. It is important to keep in mind that you can modify/add sections to fit your project's needs. These are just there to get you started."]
[:p "The first section declares the file's namespace and lists all of the file's dependencies. If you want a deeper look into what core.clj does you can find the method/macro definitions that are being used in this section."]
[:p "The second section calls a macro called defroutes. This macro is responsable for defining the routes of the website. By default it sets a GET request on the '/' route to render a pre-made index page. It also tells the application to render a pre-made 404 page if a non-existent route is accessed."]
[:p "The most interesting part of the second section tells Joodo to look for any files with namespaces starting with '_project_name_.controller and add the routes they define to the list of routes. More about controllers can be found in the controllers section below."]
[:p "The third section wraps information around the routes. By default, the only property being wrapped is the view context. It sets the template root to the view directory and sets all of the view's namespaces to a view-helper."]

[:h3 "Controller Directory"]
[:p "By default this directory is empty. However as your project grows, this directory will become more and more important. The files that go here contain additional routes that are related to each other. For example, in this website there is a controller called tutorial_controller.clj that holds the routes for all of the tutorial pages."]
[:p "All files in this directory should have an extension of _controller.clj if it wants Joodo to load it as a controller. Additionally, the namespace for the controller should be joodo.controller.name-controller (where name is replaced by your controller's). Then just define your routes using the defroutes macro. Just make sure to name the defroutes macro call name-controller (again replacing name with the name of the controller)."]

[:h3 "Model Directory"]
[:p "This directory is empty by default as well. If your application requires the ability to store data, all of that logic can go in this directory."]
[:p "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc, quis gravida magna mi a libero. Fusce vulputate eleifend sapien. Vestibulum purus quam, scelerisque ut, mollis sed, nonummy id, metus. Nullam accumsan lorem in dui. Cras ultricies mi eu turpis hendrerit fringilla."]

[:h3 "View Directory"]
[:p "Files in the view directory are used to create html that will be rendered in browsers and viewed by your visitors. This is done by using a markup language called " [:a {:href "https://github.com/weavejester/hiccup" :target "_blank"} "hiccup"] "."]
[:p "If you want to make these pages dynamic, you can write clojure logic directly in the hiccup file. If you want to limit the amount of logic in your views you can extract logic into your view_helpers.clj file and access those functions in all of your views."]