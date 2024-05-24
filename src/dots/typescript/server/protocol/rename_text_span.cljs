(ns dots.typescript.server.protocol.rename-text-span)

(defn prefix-text
  ^js [rename-text-span]
  (.-prefixText ^js rename-text-span))

(defn suffix-text
  ^js [rename-text-span]
  (.-suffixText ^js rename-text-span))

(defn context-start
  ^js [rename-text-span]
  (.-contextStart ^js rename-text-span))

(defn set-context-start!
  ^js [rename-text-span value]
  (set! (.-contextStart ^js rename-text-span) value))

(defn context-end
  ^js [rename-text-span]
  (.-contextEnd ^js rename-text-span))

(defn set-context-end!
  ^js [rename-text-span value]
  (set! (.-contextEnd ^js rename-text-span) value))

(defn start
  "First character of the definition."
  ^js [rename-text-span]
  (.-start ^js rename-text-span))

(defn set-start!
  "First character of the definition."
  ^js [rename-text-span value]
  (set! (.-start ^js rename-text-span) value))

(defn end
  "One character past last character of the definition."
  ^js [rename-text-span]
  (.-end ^js rename-text-span))

(defn set-end!
  "One character past last character of the definition."
  ^js [rename-text-span value]
  (set! (.-end ^js rename-text-span) value))
