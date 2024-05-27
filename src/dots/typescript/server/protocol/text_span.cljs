(ns dots.typescript.server.protocol.text-span
  "Object found in response messages defining a span of text in source code.")

(defn start
  "First character of the definition.
   
   **Returns:** `Location`"
  ^js [text-span]
  (.-start ^js text-span))

(defn set-start!
  "First character of the definition."
  ^js [text-span value]
  (set! (.-start ^js text-span) value))

(defn end
  "One character past last character of the definition.
   
   **Returns:** `Location`"
  ^js [text-span]
  (.-end ^js text-span))

(defn set-end!
  "One character past last character of the definition."
  ^js [text-span value]
  (set! (.-end ^js text-span) value))
