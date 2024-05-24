(ns dots.typescript.server.install-package-options-with-project)

(defn project-name
  ^js [install-package-options-with-project]
  (.-projectName ^js install-package-options-with-project))

(defn set-project-name!
  ^js [install-package-options-with-project value]
  (set! (.-projectName ^js install-package-options-with-project) value))

(defn project-root-path
  ^js [install-package-options-with-project]
  (.-projectRootPath ^js install-package-options-with-project))

(defn set-project-root-path!
  ^js [install-package-options-with-project value]
  (set! (.-projectRootPath ^js install-package-options-with-project) value))

(defn file-name
  ^js [install-package-options-with-project]
  (.-fileName ^js install-package-options-with-project))

(defn set-file-name!
  ^js [install-package-options-with-project value]
  (set! (.-fileName ^js install-package-options-with-project) value))

(defn package-name
  ^js [install-package-options-with-project]
  (.-packageName ^js install-package-options-with-project))

(defn set-package-name!
  ^js [install-package-options-with-project value]
  (set! (.-packageName ^js install-package-options-with-project) value))
