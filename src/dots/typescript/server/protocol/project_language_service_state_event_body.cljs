(ns dots.typescript.server.protocol.project-language-service-state-event-body)

(defn project-name
  "Project name that has changes in the state of language service.
   For configured projects this will be the config file path.
   For external projects this will be the name of the projects specified when project was open.
   For inferred projects this event is not raised."
  ^js [project-language-service-state-event-body]
  (.-projectName ^js project-language-service-state-event-body))

(defn set-project-name!
  "Project name that has changes in the state of language service.
   For configured projects this will be the config file path.
   For external projects this will be the name of the projects specified when project was open.
   For inferred projects this event is not raised."
  ^js [project-language-service-state-event-body value]
  (set! (.-projectName ^js project-language-service-state-event-body) value))

(defn language-service-enabled?
  "True if language service state switched from disabled to enabled
   and false otherwise."
  ^js [project-language-service-state-event-body]
  (.-languageServiceEnabled ^js project-language-service-state-event-body))

(defn set-language-service-enabled!
  "True if language service state switched from disabled to enabled
   and false otherwise."
  ^js [project-language-service-state-event-body value]
  (set! (.-languageServiceEnabled ^js project-language-service-state-event-body) value))
