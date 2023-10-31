(ns dots.typescript.server.install-types)

(defn kind
  ^js [install-types]
  (.-kind ^js install-types))

(defn event-id
  ^js [install-types]
  (.-eventId ^js install-types))

(defn typings-installer-version
  ^js [install-types]
  (.-typingsInstallerVersion ^js install-types))

(defn packages-to-install
  ^js [install-types]
  (.-packagesToInstall ^js install-types))

(defn project-name
  ^js [install-types]
  (.-projectName ^js install-types))
