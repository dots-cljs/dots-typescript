(ns dots.typescript.server.protocol.text-span-with-context)

(defn context-start
  "**Returns:** `Location | undefined`"
  ^js [text-span-with-context]
  (.-contextStart ^js text-span-with-context))

(defn set-context-start!
  ^js [text-span-with-context value]
  (set! (.-contextStart ^js text-span-with-context) value))

(defn context-end
  "**Returns:** `Location | undefined`"
  ^js [text-span-with-context]
  (.-contextEnd ^js text-span-with-context))

(defn set-context-end!
  ^js [text-span-with-context value]
  (set! (.-contextEnd ^js text-span-with-context) value))

(defn start
  "First character of the definition.
   
   **Returns:** `Location`"
  ^js [text-span-with-context]
  (.-start ^js text-span-with-context))

(defn set-start!
  "First character of the definition."
  ^js [text-span-with-context value]
  (set! (.-start ^js text-span-with-context) value))

(defn end
  "One character past last character of the definition.
   
   **Returns:** `Location`"
  ^js [text-span-with-context]
  (.-end ^js text-span-with-context))

(defn set-end!
  "One character past last character of the definition."
  ^js [text-span-with-context value]
  (set! (.-end ^js text-span-with-context) value))
