(ns dots.typescript.server.protocol.highlight-span
  "Span augmented with extra information that denotes the kind of the highlighting to be used for span.")

(defn kind
  ^js [highlight-span]
  (.-kind ^js highlight-span))

(defn set-kind!
  ^js [highlight-span value]
  (set! (.-kind ^js highlight-span) value))

(defn context-start
  ^js [highlight-span]
  (.-contextStart ^js highlight-span))

(defn set-context-start!
  ^js [highlight-span value]
  (set! (.-contextStart ^js highlight-span) value))

(defn context-end
  ^js [highlight-span]
  (.-contextEnd ^js highlight-span))

(defn set-context-end!
  ^js [highlight-span value]
  (set! (.-contextEnd ^js highlight-span) value))

(defn start
  "First character of the definition."
  ^js [highlight-span]
  (.-start ^js highlight-span))

(defn set-start!
  "First character of the definition."
  ^js [highlight-span value]
  (set! (.-start ^js highlight-span) value))

(defn end
  "One character past last character of the definition."
  ^js [highlight-span]
  (.-end ^js highlight-span))

(defn set-end!
  "One character past last character of the definition."
  ^js [highlight-span value]
  (set! (.-end ^js highlight-span) value))
