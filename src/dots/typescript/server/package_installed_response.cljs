(ns dots.typescript.server.package-installed-response)

(defn kind
  ^js [package-installed-response]
  (.-kind ^js package-installed-response))

(defn id
  ^js [package-installed-response]
  (.-id ^js package-installed-response))

(defn success?
  ^js [package-installed-response]
  (.-success ^js package-installed-response))

(defn message
  ^js [package-installed-response]
  (.-message ^js package-installed-response))

(defn project-name
  ^js [package-installed-response]
  (.-projectName ^js package-installed-response))
