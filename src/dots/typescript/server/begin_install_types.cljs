(ns dots.typescript.server.begin-install-types)

(defn kind
  ^js [begin-install-types]
  (.-kind ^js begin-install-types))

(defn event-id
  ^js [begin-install-types]
  (.-eventId ^js begin-install-types))

(defn typings-installer-version
  ^js [begin-install-types]
  (.-typingsInstallerVersion ^js begin-install-types))

(defn packages-to-install
  ^js [begin-install-types]
  (.-packagesToInstall ^js begin-install-types))

(defn project-name
  ^js [begin-install-types]
  (.-projectName ^js begin-install-types))
