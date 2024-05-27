(ns dots.typescript.server.install-package-request)

(defn kind
  "**Returns:** `\"installPackage\"`"
  ^js [install-package-request]
  (.-kind ^js install-package-request))

(defn file-name
  "**Returns:** `Path`"
  ^js [install-package-request]
  (.-fileName ^js install-package-request))

(defn package-name
  "**Returns:** `string`"
  ^js [install-package-request]
  (.-packageName ^js install-package-request))

(defn project-root-path
  "**Returns:** `Path`"
  ^js [install-package-request]
  (.-projectRootPath ^js install-package-request))

(defn id
  "**Returns:** `number`"
  ^js [install-package-request]
  (.-id ^js install-package-request))

(defn project-name
  "**Returns:** `string`"
  ^js [install-package-request]
  (.-projectName ^js install-package-request))
