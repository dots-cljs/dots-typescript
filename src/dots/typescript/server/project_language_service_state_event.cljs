(ns dots.typescript.server.project-language-service-state-event)

(defn event-name
  "**Returns:** `\"projectLanguageServiceState\"`"
  ^js [project-language-service-state-event]
  (.-eventName ^js project-language-service-state-event))

(defn set-event-name!
  ^js [project-language-service-state-event value]
  (set! (.-eventName ^js project-language-service-state-event) value))

(defn data
  "**Returns:** `{ project: Project; languageServiceEnabled: boolean; }`"
  ^js [project-language-service-state-event]
  (.-data ^js project-language-service-state-event))

(defn set-data!
  ^js [project-language-service-state-event value]
  (set! (.-data ^js project-language-service-state-event) value))
