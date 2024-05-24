(ns dots.typescript.server.protocol.definition-info)

(defn unverified?
  "When true, the file may or may not exist."
  ^js [definition-info]
  (.-unverified ^js definition-info))

(defn set-unverified!
  "When true, the file may or may not exist."
  ^js [definition-info value]
  (set! (.-unverified ^js definition-info) value))

(defn file
  "File containing text span."
  ^js [definition-info]
  (.-file ^js definition-info))

(defn set-file!
  "File containing text span."
  ^js [definition-info value]
  (set! (.-file ^js definition-info) value))

(defn start
  "First character of the definition."
  ^js [definition-info]
  (.-start ^js definition-info))

(defn set-start!
  "First character of the definition."
  ^js [definition-info value]
  (set! (.-start ^js definition-info) value))

(defn end
  "One character past last character of the definition."
  ^js [definition-info]
  (.-end ^js definition-info))

(defn set-end!
  "One character past last character of the definition."
  ^js [definition-info value]
  (set! (.-end ^js definition-info) value))

(defn context-start
  ^js [definition-info]
  (.-contextStart ^js definition-info))

(defn set-context-start!
  ^js [definition-info value]
  (set! (.-contextStart ^js definition-info) value))

(defn context-end
  ^js [definition-info]
  (.-contextEnd ^js definition-info))

(defn set-context-end!
  ^js [definition-info value]
  (set! (.-contextEnd ^js definition-info) value))
