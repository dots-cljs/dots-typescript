(ns build
  (:require [clojure.tools.build.api :as b]
            [deps-deploy.deps-deploy :as d]))

(def lib 'io.github.dots-cljs/dots-typescript)
(def version (format "5.4.5-%s" (b/git-count-revs nil)))
(def class-dir "target/classes")
(def jar-file (format "target/%s-%s.jar" (name lib) version))

(def basis (delay (b/create-basis {:project "deps.edn"})))

(def pom-data
  [[:description "ClojureScript wrapper for TypeScript"]
   [:url ""]
   [:licenses
    [:license
     [:name "MIT License"]
     [:url "https://opensource.org/license/mit"]]]
   [:developers
    [:developer
     [:name "Ferdinand Beyer"]]]
   [:scm
    [:url "https://github.com/dots-cljs/dots-typescript"]
    [:connection "scm:git:https://github.com/dots-cljs/dots-typescript.git"]
    [:developerConnection "scm:git:ssh:git@github.com:dots-cljs/dots-typescript.git"]
    [:tag (str "v" version)]]])

(defn clean [_]
  (b/delete {:path "target"}))

(defn jar [_]
  (b/write-pom {:class-dir class-dir
                :lib lib
                :version version
                :basis @basis
                :src-dirs ["src"]
                :pom-data pom-data})
  (b/copy-dir {:src-dirs ["src" "resources"]
               :target-dir class-dir})
  (b/jar {:class-dir class-dir
          :jar-file jar-file}))

(defn deploy [_]
  (d/deploy {:installer :remote
             :artifact  (b/resolve-path jar-file)
             :pom-file  (b/pom-path {:class-dir class-dir
                                     :lib lib})}))
