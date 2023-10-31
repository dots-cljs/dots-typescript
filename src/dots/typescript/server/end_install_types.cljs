(ns dots.typescript.server.end-install-types)

(defn kind
  ^js [end-install-types]
  (.-kind ^js end-install-types))

(defn install-success?
  ^js [end-install-types]
  (.-installSuccess ^js end-install-types))

(defn event-id
  ^js [end-install-types]
  (.-eventId ^js end-install-types))

(defn typings-installer-version
  ^js [end-install-types]
  (.-typingsInstallerVersion ^js end-install-types))

(defn packages-to-install
  ^js [end-install-types]
  (.-packagesToInstall ^js end-install-types))

(defn project-name
  ^js [end-install-types]
  (.-projectName ^js end-install-types))
