(ns dots.typescript.server.plugin-create-info)

(defn project
  ^js [plugin-create-info]
  (.-project ^js plugin-create-info))

(defn set-project!
  ^js [plugin-create-info value]
  (set! (.-project ^js plugin-create-info) value))

(defn language-service
  ^js [plugin-create-info]
  (.-languageService ^js plugin-create-info))

(defn set-language-service!
  ^js [plugin-create-info value]
  (set! (.-languageService ^js plugin-create-info) value))

(defn language-service-host
  ^js [plugin-create-info]
  (.-languageServiceHost ^js plugin-create-info))

(defn set-language-service-host!
  ^js [plugin-create-info value]
  (set! (.-languageServiceHost ^js plugin-create-info) value))

(defn server-host
  ^js [plugin-create-info]
  (.-serverHost ^js plugin-create-info))

(defn set-server-host!
  ^js [plugin-create-info value]
  (set! (.-serverHost ^js plugin-create-info) value))

(defn session
  ^js [plugin-create-info]
  (.-session ^js plugin-create-info))

(defn set-session!
  ^js [plugin-create-info value]
  (set! (.-session ^js plugin-create-info) value))

(defn config
  ^js [plugin-create-info]
  (.-config ^js plugin-create-info))

(defn set-config!
  ^js [plugin-create-info value]
  (set! (.-config ^js plugin-create-info) value))
