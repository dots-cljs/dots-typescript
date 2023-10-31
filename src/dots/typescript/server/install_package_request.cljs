(ns dots.typescript.server.install-package-request)

(defn kind
  ^js [install-package-request]
  (.-kind ^js install-package-request))

(defn file-name
  ^js [install-package-request]
  (.-fileName ^js install-package-request))

(defn package-name
  ^js [install-package-request]
  (.-packageName ^js install-package-request))

(defn project-root-path
  ^js [install-package-request]
  (.-projectRootPath ^js install-package-request))

(defn project-name
  ^js [install-package-request]
  (.-projectName ^js install-package-request))
