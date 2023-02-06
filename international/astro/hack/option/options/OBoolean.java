/*
 * Decompiled with CFR 0.150.
 */
package international.astro.hack.option.options;

import international.astro.hack.option.Option;

public class OBoolean
        extends Option {
    private boolean enabled;

    public OBoolean(String name, boolean defVal) {
        super(name);
        this.enabled = defVal;
    }

    public void toggle() {
        this.enabled = !this.enabled;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}

